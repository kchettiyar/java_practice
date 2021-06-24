package com.kchetty.ActuatorPro.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.kchetty.ActuatorPro.Repository.EmployeeRespository;
import com.kchetty.ActuatorPro.beans.EmployeeBean;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;

@Service
public class EmployeeService {
	@Autowired
	private MongoOperations __mongoOp;

	@Autowired
	private EmployeeRespository __employeeResp;

	private String __employee = "employee";

	public Map<String, Object> saveEmployee(EmployeeBean _employee) throws Exception {
		Map<String, Object> res = new HashMap<>();
		if (__employeeResp.findByEmail(_employee.getEmail()) != null) {
			res.put("message", "This employee(" + _employee.getEmail() + ") already exists!!!");
			return res;
		}

		_employee.setEmployeeId(getLatestId(this.__employee));
		__employeeResp.insert(_employee);

		res.put("message", "The campaign(" + _employee.getEmail() + ") added successfully!!!");
		res.put("employees", getAllEmployee());
		return res;
	}

	public Map<String, Object> getEmployee() {
		Map<String, Object> res = new HashMap<>();
		res.put("employees", getAllEmployee());
		return res;
	}

	public List<EmployeeBean> getAllEmployee() {
		return __employeeResp.findAll(Sort.by(Sort.Direction.DESC, "$natural"));
	}

	private String getLatestId(String IdName) {
		Bson query = new Document("_id", IdName);
		MongoCollection<Document> coll = __mongoOp.getCollection("demoSequence");
		Bson update = new Document("$inc", new Document("seq", 1));
		FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
		options.returnDocument(ReturnDocument.AFTER);
		options.upsert(true);
		return coll.findOneAndUpdate(query, update, options).getInteger("seq").toString();
	}
}

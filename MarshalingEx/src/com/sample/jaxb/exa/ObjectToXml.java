package com.sample.jaxb.exa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ObjectToXml {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee emp = new Employee(1, "ejio");
		
		marshaller.marshal(emp, new FileOutputStream("employee.xml"));
		
		Unmarshaller unm = context.createUnmarshaller();
		Employee emp1 = (Employee) unm.unmarshal(new FileReader("employee.xml"));
		System.out.println(emp1.getId()+" id of employee "+emp1.getName());
	}

}

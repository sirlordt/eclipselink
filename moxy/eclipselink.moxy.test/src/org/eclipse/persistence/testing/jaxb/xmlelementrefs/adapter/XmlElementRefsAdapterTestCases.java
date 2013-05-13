/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith - April 2013
 ******************************************************************************/  
package org.eclipse.persistence.testing.jaxb.xmlelementrefs.adapter;

import java.util.ArrayList;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.eclipse.persistence.internal.oxm.Constants;
import org.eclipse.persistence.internal.oxm.XMLConversionManager;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class XmlElementRefsAdapterTestCases extends JAXBWithJSONTestCases{

	private static final String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelementrefs/foo.xml";
    private static final String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlelementrefs/foo.json";

    public XmlElementRefsAdapterTestCases(String name) throws Exception {
		super(name);
		setControlJSON(JSON_RESOURCE);
		setControlDocument(XML_RESOURCE);
		setClasses(new Class[]{Foo.class, ObjectFactory.class});
	}
	
    @Override
	protected Object getControlObject() {
		Foo f = new Foo();
		f.e1OrE2 = new ArrayList<JAXBElement<byte[]>>();
	
		byte[] bytes = (byte[]) XMLConversionManager.getDefaultXMLManager().convertObject("001122", byte[].class);
		byte[] bytes2 = (byte[]) XMLConversionManager.getDefaultXMLManager().convertObject("cafe", byte[].class, Constants.BASE_64_BINARY_QNAME);
	
		JAXBElement jb1= new JAXBElement(new QName("e1"), byte[].class, bytes);
		f.e1OrE2.add(jb1);
		JAXBElement jb2= new JAXBElement(new QName("e2"), byte[].class, bytes2);
		f.e1OrE2.add(jb2);
		f.e1OrE2.add(jb1);
		f.e1OrE2.add(jb2);
		return f;
	}
    
    @Override
	protected Object getJSONReadControlObject() {		
    	Foo f = new Foo();
		f.e1OrE2 = new ArrayList<JAXBElement<byte[]>>();

		byte[] bytes = (byte[]) XMLConversionManager.getDefaultXMLManager().convertObject("001122", byte[].class);
		byte[] bytes2 = (byte[]) XMLConversionManager.getDefaultXMLManager().convertObject("cafe", byte[].class, Constants.BASE_64_BINARY_QNAME);
	
		JAXBElement jb1= new JAXBElement(new QName("e1"), byte[].class, bytes);
		JAXBElement jb2= new JAXBElement(new QName("e2"), byte[].class, bytes2);
		f.e1OrE2.add(jb1);
			
		f.e1OrE2.add(jb1);
		f.e1OrE2.add(jb2);
		f.e1OrE2.add(jb2);
		return f;
    }
}
package com.visa.prj.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.visa.prj.entity.Address;

@Controller
public class TestController {
    @RequestMapping("test.do")
    public String doTest(@RequestParam("age") int age,@RequestParam("hiredate") Date d,@RequestParam("address") Address a) {
        System.out.println(age);
        System.out.println(d);
        System.out.println(a.getHouseNo()+ " " + a.getCity());
        return "index.jsp";
    }
    @InitBinder//custom conversion from RequestParam
    public void dateTypeBinder(WebDataBinder binder) {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	sdf.setLenient(true);
    	binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,false));
    	binder.registerCustomEditor(Address.class, new AddressPropertyEditor() );
    }
}

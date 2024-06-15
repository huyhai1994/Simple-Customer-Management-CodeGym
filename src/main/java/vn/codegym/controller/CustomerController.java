package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Customer;
import vn.codegym.service.impl.SimpleCustomerServiceImpl;

import java.util.List;

//TODO: Bước 3: Sử dụng Spring MVC controller để xử lý
//              request xem danh sách khách hàng
//      - Tạo một class controller (được ấn định bằng annotation @Controller),
//      bổ sung cho nó một handle method có khả năng thông báo ra
//      tên của view cần dùng.
@Controller
public class CustomerController {
    @Autowired
    private SimpleCustomerServiceImpl customerService;

    @GetMapping("/customers")
    public ModelAndView showList(Model model) {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return modelAndView;
    }
}

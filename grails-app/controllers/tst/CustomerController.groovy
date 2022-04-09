package tst

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CustomerController {

    static scaffold = Customer

    CustomerService customerService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

}

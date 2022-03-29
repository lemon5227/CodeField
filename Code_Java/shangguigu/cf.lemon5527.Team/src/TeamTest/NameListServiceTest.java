package TeamTest;

import Domain.Employee;
import Service.NameListService;
import Service.TeamException;
import org.junit.Test;
/**
 * 对NameListSevice测试
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployee();
        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testgetEmployee(){
        NameListService service = new NameListService();
        int id = 101;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}

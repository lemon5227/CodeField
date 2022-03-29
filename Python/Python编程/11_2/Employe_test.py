import unittest
from Employee import Employee_to_Test
class Employee_test(unittest.TestCase):
    def setup(self):
        self.one_employee = Employee_to_Test("joker",18,10000)
    
    
    def test_give_default_raise(self):
        self.one_employee.give_raise()
        self.assertEqual(15000, self.one_employee.salary)
    
    def test_give_custom_raise(self):
        self.one_employee.give_raise(2000)
        self.assertEqual(12000, self.one_employee.salary)

unittest.main()
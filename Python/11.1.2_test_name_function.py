import unittest
from test11_1 import get_formatted_name

class NamesTestCase(unittest.TestCase):
    """测试"""

    def test_first_last_name(self):
        """能正确出来像Janis Joplin这样的名字吗？"""
        formatted_name = get_formatted_name('janis','joplin')
        self.assertEqual(formatted_name,"Janis Joplin")

unittest.main()
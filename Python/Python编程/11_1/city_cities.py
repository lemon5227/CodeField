import unittest
from city_functions import rerurn_string

class TestCase(unittest.TestCase):
    def test_city_country(self):
        full_string = rerurn_string("santiago","chile")
        self.assertEqual(full_string,"santiago,chile")

unittest.main()
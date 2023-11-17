"""Тесты проверяют, что программа правильно сравнивает среднее значение первого списка
с средним значением второго списка и возвращает соответствующее сообщение"""
import pytest

from listscomparator import ListsComparator


def test_compare_lists_first_list_has_greater_average():
    """ожидается, что первый список имеет большее среднее значение"""
    list1 = [1, 2, 3, 4, 5, 50]
    list2 = [6, 7, 8, 9, 10]
    comparator = ListsComparator(list1, list2)
    assert comparator.compare_lists() == "Первый список имеет большее среднее значение"


def test_compare_lists_second_list_has_greater_average():
    """ожидается, что второй список имеет большее среднее значение"""
    list1 = [1, 2, 3, 4, 5]
    list2 = [6, 7, 8, 9, 10, 11]
    comparator = ListsComparator(list1, list2)
    assert comparator.compare_lists() == "Второй список имеет большее среднее значение"


def test_compare_lists_average_values_are_equal():
    """ожидается, что средние значения списков равны"""
    list1 = [1, 2, 3, 4, 5]
    list2 = [1, 2, 3, 4, 5]
    comparator = ListsComparator(list1, list2)
    assert comparator.compare_lists() == "Средние значения равны"


def test_compare_lists_invalid_input():
    """ожидается, что будет возбуждено исключение TypeError"""
    list1 = [1, 2, 3, 4, 5]
    list2 = "invalid"
    with pytest.raises(TypeError):
        comparator = ListsComparator(list1, list2)
        comparator.compare_lists()


def test_compare_lists_empty_lists_as_strings():
    """ожидается, что будет возбуждено исключение TypeError"""
    list1 = "[]"
    list2 = "[]"
    with pytest.raises(TypeError):
        comparator = ListsComparator(list1, list2)
        comparator.compare_lists()


def test_compare_lists_invalid_list_elements():
    """ожидается, что будет возбуждено исключение TypeError"""
    list1 = [1, 2, 3, "invalid", 5]
    list2 = [6, 7, 8, 9, 10]
    with pytest.raises(TypeError):
        comparator = ListsComparator(list1, list2)
        comparator.compare_lists()

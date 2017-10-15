package com.learn.groovyinaction.datatypes

import static java.util.Calendar.*

def me = 'Peter'
def you = 'Jane'
def line = "me $me - you $you"
assert line == 'me Peter - you Jane'
assert line instanceof GString
assert line.strings[0] == 'me '
assert line.strings[1] == ' - you '
assert line.values[0] == 'Peter'
assert line.values[1] == 'Jane'

TimeZone.default = TimeZone.getTimeZone('GMT')
def date = new Date(0)
def dateMap = [y: date[YEAR] - 1900, m: date[MONTH], d: date[DAY_OF_MONTH]]
def dateResult = "Year $dateMap.y Month $dateMap.m Day $dateMap.d"
assert dateResult == 'Year 70 Month 0 Day 1'

def timeZone = TimeZone.getTimeZone('GMT')
def format = 'd MMM YYYY HH:mm:SS z'
def dateFormatResult = "Date is ${date.format(format, timeZone)} !"
assert dateFormatResult == 'Date is 1 Jan 1970 00:00:00 GMT !'

def sqlYear = """
    SELECT FROM MyTable
    WHERE Year = $dateMap.y 
"""
assert sqlYear == """
    SELECT FROM MyTable
    WHERE Year = 70 
"""

def escapedDollar = "my 0.02\$"
assert escapedDollar == 'my 0.02$'

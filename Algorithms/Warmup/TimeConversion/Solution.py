#!/bin/python

import sys


time = raw_input().strip()
if time[0:2] == '12':
    time = str(int(time[0:2]) - 12) + '0' + time[2:10]
if time[8] == 'A':
    print(time[0:8])
else:
    print(str(int(time[0:2]) + 12) + time[2:8])

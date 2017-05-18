#!/bin/python

import sys


n = int(raw_input().strip())
for x in range(1, n + 1):
    print(" " * (n - x) + "#" * x)v

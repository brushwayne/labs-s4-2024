#!/bin/bash

echo input the temperature in celcius
read c

f=$(($c * 9 / 5))
f=$(($f + 32))

echo In Fahrenheit = $f F

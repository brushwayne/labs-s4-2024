#!/bin/bash

echo input Basic Salary
read basic

ta=$((30 * $basic / 100))
hra=$((7 * $basic / 100))

gross=$(($basic + $ta + $hra))

echo Gross Salary for basic = $basic is $gross

#!/bin/bash

echo input marks for subject one
read sub1

echo input marks for subject two
read sub2

echo input marks for subject three
read sub3

total=$(($sub1 + $sub2 + $sub3))

avg=$(($total / 3))
per=$(($total * 100 / 300))

echo Average = $avg
echo Percentage = $per

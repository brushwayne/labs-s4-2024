#!/bin/bash

echo input first number
read a

echo input second number
read b

old_a=$a
old_b=$b

a="$(($a ^ $b))"
b="$(($a ^ $b))"
a="$(($a ^ $b))"

echo a became $a from $old_a
echo b became $b from $old_b



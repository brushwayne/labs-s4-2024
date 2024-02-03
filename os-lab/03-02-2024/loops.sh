#array
#
# array indexing starts from 1 in zsh shell
#
arr=(1 2 3 "ABC" 4.5 "X")

for item in arr
do
    echo $item
done

echo ${#arr[*]} #length of entire array
echo ${#arr[1]} #length of first element
echo ${arr[1]} #first element



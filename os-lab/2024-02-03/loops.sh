#array
#
# array indexing starts from 1 in zsh shell
#
arr=(1 2 3 "ABC" 4.5 "X")

for item in ${arr[*]}
do
    echo $item
done


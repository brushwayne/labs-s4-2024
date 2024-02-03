x=1
while [ $x -lt 100 ]
do
    num=$x
    factors=1
    while [ $num -ne 1 ]
    do
        res=$(( $x % $num ))
        if [ $res -eq 0 ]
        then
            factors=$(( $factors + 1 ))
        fi

        num=$(( $num - 1 ))
    done

    if [ $factors -le 2 ]
    then
        echo $x
    fi

    x=$(( $x + 1 ))
done


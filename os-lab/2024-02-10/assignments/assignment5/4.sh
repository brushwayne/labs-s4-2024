power() {
    result=1
    num=$1
    pow=$2
    while [ $pow -ne 1 ]
    do
        result="$(( $result * $num ))"
        pow="$(( $pow - 1 ))"
    done
    echo $result
}

power 4 4

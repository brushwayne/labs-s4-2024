fact()
{
    num=$1
    f=1

    while [ $num -ne 1 ]
    do
        f="$(( $f * $num ))"
        num="$(( $num - 1 ))"
    done

    echo $f
}

fact 5
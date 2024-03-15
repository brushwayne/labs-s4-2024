gcd()
{
    a=$1
    b=$2
    while [ $a -ne $b ]
    do
        if [ $a -gt $b ]
        then 
            a="$(( $a - $b ))"
        else
            b="$(( $b - $a ))"
        fi
    done

    echo $a
}

gcd 36 126
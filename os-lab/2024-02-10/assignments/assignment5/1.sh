swap()
{
    num1=$1
    num2=$2

    num1="$(( $num1 ^ $num2 ))"
    num2="$(( $num1 ^ $num2 ))"
    num1="$(( $num1 ^ $num2 ))"

    echo $num1 $num2
}

swap 2 3
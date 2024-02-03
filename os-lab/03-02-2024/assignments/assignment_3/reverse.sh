rev=0
temp=$1

while [ $temp -ne 0 ]
do
    digit=$(( $temp % 10 ))
    rev=$(( $rev * 10 + $digit ))
    temp=$(( $temp / 10 ))
done

echo $rev

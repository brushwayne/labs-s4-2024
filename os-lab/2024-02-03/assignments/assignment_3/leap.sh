res1=$(( $1 % 4 ))
res2=$(( $1 % 400 ))

if [ $res1 -eq 0 ] || [ $res2 -eq 0 ]
then
    echo $1 is leap
else
    echo $1 is not leap
fi

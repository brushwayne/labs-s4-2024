if [ $1 -gt $2 ] && [ $1 -gt $3 ]
then
    echo $1 is greatest
elif [ $2 -gt $1 ] && [ $2 -gt $3 ]
then
    echo $2 is greatest
else
    echo $3 is greatest
fi

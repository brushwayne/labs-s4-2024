read A
read B

if [ $A -gt $B ]
then
    echo $A is greater

elif [ $B -gt $A ]
then
    echo $B is greater
fi


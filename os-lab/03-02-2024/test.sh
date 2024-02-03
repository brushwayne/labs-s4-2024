read A
read B

if [ $A -gt $B ]
then
    echo $A is greater

# if block in an if block, ie nested if
if []
then
    elif
    then
fi

elif [ $B -gt $A ]
then
    echo $B is greater
fi


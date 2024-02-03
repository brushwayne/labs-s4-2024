read A
until [ $A -gt 10 ]
    do
        echo $A
        A=`expr $A + 1`
    done



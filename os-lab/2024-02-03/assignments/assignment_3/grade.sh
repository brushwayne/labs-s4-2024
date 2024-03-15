marks=$1

if [ $marks -ge 90 ] && [ $marks -le 100 ]
then
    echo O grade

elif [ $marks -ge 80 ] && [ $marks -le 89 ]
then
    echo E grade

elif [ $marks -ge 70 ] && [ $marks -le 79 ]
then
    echo A grade

elif [ $marks -ge 60 ] && [ $marks -le 69 ]
then
    echo B grade

elif [ $marks -ge 50 ] && [ $marks -le 59 ]
then
    echo C grade

elif [ $marks -ge 40 ] && [ $marks -le 49 ]
then
    echo D grade

elif [ $marks -lt 40 ]
then
    echo F grade

fi

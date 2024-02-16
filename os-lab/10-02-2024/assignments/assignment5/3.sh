sum_array() {
    sum=0
    for item in "${@:1}"; do
        sum=$((sum + item))
    done
    echo $sum
}

numbers=(10 20 30 40 50)
sum_array ${numbers[@]}
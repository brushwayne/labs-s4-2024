factorial() {
  if [[ $1 -le 1 ]]; then
    echo 1
  else
    result=$(factorial $(($1 - 1)))
    echo $(( $1 * $result ))
  fi
}

factorial 5
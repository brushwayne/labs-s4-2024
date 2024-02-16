function menu {
  echo "1. Create"
  echo "2. Copy"
  echo "3. Remove"
  echo "4. Rename"
  echo "5. Exit"
  read -p "Choice: " choice
}

function create_file {
  read -p "Filename: " filename
  touch "$filename"
  if [ $? -eq 0 ]; then
    echo "Created!"
  else
    echo "Error!"
  fi
}

function copy_file {
  read -p "Source: " source
  read -p "Destination: " destination
  if [ -f "$source" ]; then
    cp "$source" "$destination"
    if [ $? -eq 0 ]; then
      echo "Copied!"
    else
      echo "Error!"
    fi
  else
    echo "Source not found!"
  fi
}

function remove_file {
  read -p "Filename: " filename
  if [ -f "$filename" ]; then
    rm -i "$filename"
  else
    echo "Not found!"
  fi
}

function rename_file {
  read -p "Current: " old_filename
  read -p "New: " new_filename
  if [ -f "$old_filename" ]; then
    mv "$old_filename" "$new_filename"
    if [ $? -eq 0 ]; then
      echo "Renamed!"
    else
      echo "Error!"
    fi
  else
    echo "Not found!"
  fi
}

choice=0
while [ $choice -ne 5 ]; do
  menu
  case $choice in
    1) create_file ;;
    2) copy_file ;;
    3) remove_file ;;
    4) rename_file ;;
    5) echo "Bye!" ;;
    *) echo "Invalid!" ;;
  esac
done

echo "Done."

#!/bin/bash

read -p "Enter filename: " filename

if [ -f "$filename" ]; then
  echo "Appending content to existing file: $filename"
  echo "This is some content to be appended" >> "$filename"
else
  echo "Creating new file: $filename"
  echo "This is some content for the new file" > "$filename"
fi

echo "Done!"
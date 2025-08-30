# Creating a list
my_list = [1, 2, 3, "hello", True]
print(f"Original list: {my_list}")

# Accessing elements by index
print(f"Element at index 0: {my_list[0]}")
print(f"Element at index 3: {my_list[3]}")

# Adding elements
my_list.append(4)  # Adds to the end
my_list.insert(1, "new_item") # Inserts at a specific index
print(f"List after adding elements: {my_list}")

# Removing elements
my_list.pop() # Removes the last element
my_list.remove("hello") # Removes the first occurrence of a value
print(f"List after removing elements: {my_list}")

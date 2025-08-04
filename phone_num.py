phoneNums = []

def add_phone_num():
    while True:
        phone_num = input("Enter a phone number (or 'q' to quit): ")
        if phone_num.lower() == "q":
            break
        if len(phone_num) < 10 and len(phone_num) > 16:
            print("Invalid phone number length. Please enter a valid phone number.")
        else:
            phoneNums.append(phone_num)
    print(f"Phone number {phoneNums} added successfully.")

def main():
    add_phone_num()
    print("Phone numbers entered:")
    for num in phoneNums:
        print(f"{num}")

if __name__ == "__main__":
    main()
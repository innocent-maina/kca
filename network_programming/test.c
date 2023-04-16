import socket
import threading

# function to handle client connections
def handle_client(conn, addr):
    print(f"New connection from {addr}")
    while True:
        # receive choice and two integers from client
        try:
            choice = int(conn.recv(1024).decode())
            if choice == 4:
                # terminate connection
                conn.close()
                print(f"Connection closed with {addr}")
                break
            num1 = int(conn.recv(1024).decode())
            num2 = int(conn.recv(1024).decode())
        except:
            print(f"Invalid input from {addr}")
            continue

        # perform operations based on choice
        if choice == 1:
            result = num1 + num2
        elif choice == 2:
            result = num1 * num2
        elif choice == 3:
            result = num1 - num2
        else:
            print(f"Invalid choice from {addr}")
            continue

        # send result to client
        conn.send(str(result).encode())
        print(f"Sent result {result} to {addr}")

# main function to listen for client connections
def main():
    # create server socket
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', 5000))
    server_socket.listen(5)
    print("Server listening on port 5000")

    while True:
        # accept client connection
        conn, addr = server_socket.accept()
        # handle client connection in a separate thread
        t = threading.Thread(target=handle_client, args=(conn, addr))
        t.start()

if _name_ == '_main_':
    main()
Here's a sample code in Python 3 for the client socket:

python
Copy code
import socket

# create client socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# connect to server
client_socket.connect(('localhost', 5000))

while True:
    # get input from user
    choice = input("Enter choice (1:add, 2:multiply, 3:subtract, 4:close): ")
    if choice == '4':
        # terminate connection
        client_socket.send(choice.encode())
        client_socket.close()
        print("Connection closed")
        break
    num1 = input("Enter first number: ")
    num2 = input("Enter second number: ")

    # send input to server
    client_socket.send(choice.encode())
    client_socket.send(num1.encode())
    client_socket.send(num2.encode())

    # receive result from server
    result = client_socket.recv(1024).decode()
    print(f"Result: {result}")

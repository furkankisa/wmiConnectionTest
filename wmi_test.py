import wmi

def main():
    c = wmi.WMI("ip_address", user="username",password="password")

    wql = "Select * From Win32_Process"
    for item in c.query (wql):
        print(item)


if __name__ == "__main__":
    main()

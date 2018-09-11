# wmiConnectionTest
Java-Python with wmi query
Java daki wmi connection librarysi olan "jinterop" aldığım hatalardan dolayı bu yolu denedim.
# İşleyiş 
Java tarafında bir process oluşturup command line da py dosyasını execute yapıyoruz .
Python dosyasındaki outputları java da dinliyoruz.
Sonucu java tarafında gösteriyoruz.
#Gereklilikler
pip install wmi : wmi lib indiriliyor

     import wmi


    c = wmi.WMI("ip_address", user="username",password="password")

    wql = "Select * From Win32_Process"
    for item in c.query (wql):
        print(item)

    
WMI_PROVIDER: https://docs.microsoft.com/en-us/windows/desktop/wmisdk/wmi-classes

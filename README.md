Baitap01 – Android Studio

Thông tin sinh viên:

Họ tên: Đỗ Đoàn Duy Hoàng

MSSV: 23162025

🎯 Yêu cầu bài tập

Tạo project Android Baitap01.

Hiển thị hình + thông tin sinh viên.

Ảnh bo tròn bằng thư viện:

implementation 'de.hdodenhof:circleimageview:3.1.0'


Ẩn ActionBar.

Nhập mảng số (ví dụ: 1,2,3,4,5)
→ In số chẵn/lẻ ra Logcat (EVEN, ODD).

Nhập chuỗi bất kỳ → đảo ngược thứ tự từ và in hoa.

🧠 Xử lý chính (tóm tắt code)

In số chẵn / lẻ

if (num % 2 == 0) Log.d("EVEN", num + "");
else Log.d("ODD", num + "");


Đảo ngược chuỗi

txtOutput.setText(
    new StringBuilder(s).reverse().toString().toUpperCase()
);

🚀 Cách chạy

Mở Android Studio → Run app trên máy ảo hoặc thiết bị thật.

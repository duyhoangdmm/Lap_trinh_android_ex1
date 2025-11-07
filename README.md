🟦 Android App — Xử lý mảng số & đảo ngược chuỗi
👨‍💻 Thông tin sinh viên

Họ tên: Đỗ Đoàn Duy Hoàng

MSSV: 23162025

📌 Mô tả ứng dụng

Ứng dụng Android gồm 2 chức năng chính:

✅ Nhập một danh sách số (ngăn cách bằng dấu phẩy), kiểm tra từng số và in ra:

EVEN → số chẵn

ODD → số lẻ
➜ Kết quả hiển thị trong Logcat (Log.d)

✅ Nhập chuỗi bất kỳ → đảo ngược thứ tự từ + chuyển thành chữ in hoa, sau đó hiển thị lên màn hình.

Ví dụ:
Input: hello world android
Output: ANDROID WORLD HELLO

🖼️ Giao diện ứng dụng

Có ảnh avatar dạng tròn (CircleImageView)

Hai ô input:

Nhập số (dạng 1,2,5,10)

Nhập chuỗi

Hai nút xử lý tương ứng

🔧 Công nghệ sử dụng
Thành phần	Mô tả
Android Studio	IDE lập trình
Ngôn ngữ	Java
UI Layout	ConstraintLayout
Thư viện hình ảnh tròn	de.hdodenhof.circleimageview

Gradle (Module: app) cần có:

implementation 'de.hdodenhof:circleimageview:3.1.0'

🧠 Logic xử lý chính
🔹 Xử lý mảng số (Log ra chẵn / lẻ)
for (int num : arrNumbers) {
    if (num % 2 == 0)
        Log.d("EVEN", String.valueOf(num));
    else
        Log.d("ODD", String.valueOf(num));
}

🔹 Đảo ngược từ & in hoa
String[] words = s.split(" ");
StringBuilder reversed = new StringBuilder();

for (int i = words.length - 1; i >= 0; i--) {
    reversed.append(words[i]).append(" ");
}
txtOutput.setText(reversed.toString().trim().toUpperCase());

🏁 Cách chạy ứng dụng

Mở Android Studio

Clone project hoặc import project

Build và chạy trên:

Emulator (API 24+)

Thiết bị thật (bật USB Debugging)

📌 Kết quả mong đợi
Chức năng	Kết quả
Nhập 1,2,5,10	Logcat: ODD: 1, EVEN: 2, ...
Nhập "hello world"	TextView: WORLD HELLO
📷 Screenshot (thêm hình ở đây)

Chèn hình ứng dụng để báo cáo đẹp hơn.

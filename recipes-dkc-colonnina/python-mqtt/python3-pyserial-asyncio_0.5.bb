
SUMMARY = "Python Serial Port Extension - Asynchronous I/O support"
HOMEPAGE = "https://github.com/pyserial/pyserial-asyncio"
AUTHOR = "pySerial-team <>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6beb1577c3b30e61130c8e748689b62d"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/e1/97/8dd1bf656796668ed4bd86058c815b130303a00a7b70cf79758e4918814a/pyserial-asyncio-0.5.tar.gz"
SRC_URI[md5sum] = "64d15bfb20982b2129b02070321f49f3"
SRC_URI[sha256sum] = "1641e5433a866eeaf6464b3ab88b741e7a89dd8cd0f851b3343b15f425138d33"

S = "${WORKDIR}/pyserial-asyncio-0.5"

DEPENDS += " "
RDEPENDS_${PN} = "python3-pyserial"

BBCLASSEXTEND = "native nativesdk"

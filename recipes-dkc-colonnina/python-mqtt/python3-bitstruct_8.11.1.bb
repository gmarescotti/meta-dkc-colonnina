
SUMMARY = "This module performs conversions between Python values and C bit field structs represented as Python byte strings."
HOMEPAGE = "https://github.com/eerimoq/bitstruct"
AUTHOR = "Erik Moqvist, Ilya Petukhov <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9aa4ec07de78abae21c490c9ffe61bd"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/95/33/9f094b5e32bc0927acf282199d35c384092dd73505c88fadb69292106eaf/bitstruct-8.11.1.tar.gz"
SRC_URI[md5sum] = "9b2503b831532ea26381f5a0e2b41253"
SRC_URI[sha256sum] = "4e7b8769c0f09fee403d0a5f637f8b575b191a79a92e140811aa109ce7461f0c"

S = "${WORKDIR}/bitstruct-8.11.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

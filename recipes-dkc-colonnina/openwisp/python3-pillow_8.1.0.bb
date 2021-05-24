
SUMMARY = "Python Imaging Library (Fork)"
HOMEPAGE = "https://python-pillow.org"
AUTHOR = "Alex Clark (PIL Fork Author) <aclark@python-pillow.org>"
LICENSE = "HPND"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0337b116233da4616ae9fdb130bf6f1a"

SRC_URI = "https://files.pythonhosted.org/packages/73/59/3192bb3bc554ccbd678bdb32993928cb566dccf32f65dac65ac7e89eb311/Pillow-8.1.0.tar.gz"
SRC_URI[md5sum] = "9e3ab8e9b30993099ae9fee73ff92276"
SRC_URI[sha256sum] = "887668e792b7edbfb1d3c9d8b5d8c859269a0f0eba4dda562adb95500f60dbba"

S = "${WORKDIR}/Pillow-8.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3

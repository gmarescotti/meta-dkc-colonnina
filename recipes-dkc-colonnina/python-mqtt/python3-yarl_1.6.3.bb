
SUMMARY = "Yet another URL library"
HOMEPAGE = "https://github.com/aio-libs/yarl/"
AUTHOR = "Andrew Svetlov <andrew.svetlov@gmail.com>"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/97/e7/af7219a0fe240e8ef6bb555341a63c43045c21ab0392b4435e754b716fa1/yarl-1.6.3.tar.gz"
SRC_URI[md5sum] = "3b6f2da3db8c645a9440375fd6a414eb"
SRC_URI[sha256sum] = "8a9066529240171b68893d60dca86a763eae2139dd42f42106b03cf4b426bf10"

S = "${WORKDIR}/yarl-1.6.3"

DEPENDS += " "
RDEPENDS_${PN} = "python3-multidict python3-idna"

BBCLASSEXTEND = "native nativesdk"

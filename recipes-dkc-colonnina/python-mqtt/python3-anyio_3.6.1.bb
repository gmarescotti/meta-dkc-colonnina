
SUMMARY = "AnyIO is an asynchronous networking"
HOMEPAGE = ""
AUTHOR = "Alex Grönholm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

inherit setuptools3 
DEPENDS += " python3-setuptools-scm-native"

SRC_URI = "https://files.pythonhosted.org/packages/67/c4/fd50bbb2fb72532a4b778562e28ba581da15067cfb2537dbd3a2e64689c1/anyio-3.6.1.tar.gz"
SRC_URI[sha256sum] = "413adf95f93886e442aea925f3ee43baa5a765a64a0f52c6081894f9992fdd0b"

S = "${WORKDIR}/anyio-3.6.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

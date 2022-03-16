
SUMMARY = "File support for asyncio."
HOMEPAGE = ""
AUTHOR = "Tin Tvrtkovic <tinchester@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/10/ca/c416cfacf6a47e1400dad56eab85aa86c92c6fbe58447d12035e434f0d5c/aiofiles-0.8.0.tar.gz"
SRC_URI[md5sum] = "697deeb4fdcb620c45f114f173ed7c0d"
SRC_URI[sha256sum] = "8334f23235248a3b2e83b2c3a78a22674f39969b96397126cc93664d9a901e59"

S = "${WORKDIR}/aiofiles-0.8.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

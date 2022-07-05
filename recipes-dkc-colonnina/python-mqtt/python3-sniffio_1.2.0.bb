
SUMMARY = "Sniff out which async library your code is running under"
HOMEPAGE = ""
AUTHOR = "Nathaniel J. Smith"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa7b86389e58dd4087a8d2b833e5fe96"

inherit setuptools3 

SRC_URI = "https://files.pythonhosted.org/packages/a6/ae/44ed7978bcb1f6337a3e2bef19c941de750d73243fc9389140d62853b686/sniffio-1.2.0.tar.gz"
SRC_URI[sha256sum] = "c4666eecec1d3f50960c6bdf61ab7bc350648da6c126e3cf6898d8cd4ddcd3de"

S = "${WORKDIR}/sniffio-1.2.0"

DEPENDS += " python3-setuptools-scm-native "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

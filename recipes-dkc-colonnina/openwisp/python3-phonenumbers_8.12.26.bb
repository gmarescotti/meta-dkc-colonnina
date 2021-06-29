
SUMMARY = "Python version of Google's common library for parsing, formatting, storing and validating international phone numbers."
HOMEPAGE = "https://github.com/daviddrysdale/python-phonenumbers"
AUTHOR = "David Drysdale <dmd@lurklurk.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/07/d6/ce91de86166b68b5d1a2a42bb4e10672f1e7b6a1fda4c758e81ef472c4e9/phonenumbers-8.12.26.tar.gz"
SRC_URI[md5sum] = "9a7f52ee7276afcbf064bf42c8edfcbd"
SRC_URI[sha256sum] = "65bab6ebdbe0ec5196c74626949748db5337d23895aabc1ef8f5d7284787998a"

S = "${WORKDIR}/phonenumbers-8.12.26"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

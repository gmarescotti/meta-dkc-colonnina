
SUMMARY = "multidict implementation"
HOMEPAGE = "https://github.com/aio-libs/multidict"
AUTHOR = "Andrew Svetlov <andrew.svetlov@gmail.com>"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e74c98abe0de8f798ca609137f9cef4a"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/1c/74/e8b46156f37ca56d10d895d4e8595aa2b344cff3c1fb3629ec97a8656ccb/multidict-5.1.0.tar.gz"
SRC_URI[md5sum] = "df8b37f069809779214d6b80b250e45b"
SRC_URI[sha256sum] = "25b4e5f22d3a37ddf3effc0710ba692cfc792c2b9edfb9c05aefe823256e84d5"

S = "${WORKDIR}/multidict-5.1.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

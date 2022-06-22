
SUMMARY = "Database Abstraction Library"
HOMEPAGE = "https://www.sqlalchemy.org"
AUTHOR = "Mike Bayer <mike_mp@zzzcomputing.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f4001d1ca15b69d096fa1b4fd1bdce79"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/8c/6b/dd25a730940556f4a0130968f29040e4aa6478285a33ac041d1b0817d398/SQLAlchemy-1.4.37.tar.gz"
SRC_URI[md5sum] = "d1d0dc5add66be192e8e1cd26026c80d"
SRC_URI[sha256sum] = "3688f92c62db6c5df268e2264891078f17ecb91e3141b400f2e28d0f75796dea"

S = "${WORKDIR}/SQLAlchemy-1.4.37"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

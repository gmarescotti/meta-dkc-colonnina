
SUMMARY = "Database Abstraction Library"
HOMEPAGE = "https://www.sqlalchemy.org"
AUTHOR = "Mike Bayer <mike_mp@zzzcomputing.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3359ed561ac16aaa25b6c6eff84df595"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/16/d6/5ca70d8ab5bc99087524fbf0b7e3cd8c19ce61ad7df27c522141a0670413/SQLAlchemy-1.4.27.tar.gz"
SRC_URI[md5sum] = "1d699f2241286b0a9b98c26d978be9a8"
SRC_URI[sha256sum] = "d768359daeb3a86644f3854c6659e4496a3e6bba2b4651ecc87ce7ad415b320c"

S = "${WORKDIR}/SQLAlchemy-1.4.27"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
